package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017122 a(n) = (8*n + 4)^10.
 * @author Sean A. Irvine
 */
public class A017122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017122() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.valueOf(1048576), Z.valueOf(61917364224L), Z.valueOf(10240000000000L), Z.valueOf(296196766695424L), Z.valueOf(3656158440062976L), Z.valueOf(27197360938418176L), Z.valueOf(144555105949057024L), Z.valueOf(604661760000000000L), Z.valueOf(2113922820157210624L), Z.valueOf(6428888932339941376L), new Z("17490122876598091776")});
  }
}
