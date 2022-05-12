package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a026.A026905;
import irvine.oeis.a026.A026906;

/**
 * A056871 Sum of partial sums of partition numbers (A026905) and partial sums of numbers of partitions into distinct parts (A026906).
 * @author Sean A. Irvine
 */
public class A056871 extends A026905 {

  private final Sequence mA = new A026906();

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}

