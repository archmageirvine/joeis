package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035592 Number of partitions of 3n with same number of parts == 1 (mod 3) and == 2 (mod 3).
 * @author Sean A. Irvine
 */
public class A035592 extends A035536 {

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    super.next();
    return t;
  }
}

