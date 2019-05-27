package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023189 Conjecturally, number of infinitely-recurring prime patterns of width <code>n (n</code> odd).
 * @author Sean A. Irvine
 */
public class A023189 extends A023192 {

  @Override
  public Z next() {
    if (mAdmissable.size() > 1) {
      super.next(); // skip even
    }
    super.next(); // step to next odd length
    int count = 0;
    for (final String pattern : mAdmissable) {
      if (pattern.charAt(0) == 'p' && pattern.charAt(pattern.length() - 1) == 'p') {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}

