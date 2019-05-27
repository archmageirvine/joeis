package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023190.
 * @author Sean A. Irvine
 */
public class A023190 extends A023192 {

  @Override
  public Z next() {
    if (mAdmissable.size() > 1) {
      super.next(); // skip even
    }
    super.next(); // step to next odd length
    int max = 0;
    for (final String pattern : mAdmissable) {
      if (pattern.charAt(0) == 'p' && pattern.charAt(pattern.length() - 1) == 'p') {
        int pCount = 1;
        for (int k = 1; k < pattern.length(); ++k) {
          if (pattern.charAt(k) == 'p') {
            ++pCount;
          }
        }
        if (pCount > max) {
          max = pCount;
        }
      }
    }
    return Z.valueOf(max);
  }
}

