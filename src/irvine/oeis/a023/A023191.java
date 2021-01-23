package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023191 Conjecturally, number of maximal infinitely-recurring prime patterns of width 2*n-1.
 * @author Sean A. Irvine
 */
public class A023191 extends A023192 {

  @Override
  public Z next() {
    if (mAdmissable.size() > 1) {
      super.next(); // skip even
    }
    super.next(); // step to next odd length
    int max = 0;
    int maxc = 0;
    for (final String pattern : mAdmissable) {
      if (pattern.charAt(0) == 'p' && pattern.charAt(pattern.length() - 1) == 'p') {
        int pCount = 1;
        for (int k = 1; k < pattern.length(); ++k) {
          if (pattern.charAt(k) == 'p') {
            ++pCount;
          }
        }
        if (pCount >= max) {
          if (pCount > max) {
            max = pCount;
            maxc = 1;
          } else {
            ++maxc;
          }
        }
      }
    }
    return Z.valueOf(maxc);
  }
}

