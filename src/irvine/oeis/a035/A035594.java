package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035594 Number of partitions of 2n with equal number of parts congruent to each of 1 and 3 (mod 4).
 * @author Sean A. Irvine
 */
public class A035594 extends A035544 {

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    return t;
  }
}

