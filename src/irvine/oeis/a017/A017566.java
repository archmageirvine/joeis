package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A017566 a(n) = (12*n+3)^10.
 * @author Sean A. Irvine
 */
public class A017566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017566() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.valueOf(59049), Z.valueOf(576650390625L), Z.valueOf(205891132094649L), Z.valueOf(8140406085191601L), Z.valueOf(119042423827613001L), Z.valueOf(984930291881790849L), Z.valueOf(5631351470947265625L), new Z("24842341419143568849"), new Z("90438207500880449001"), new Z("283942098606901565601"), new Z("792594609605189126649")});
  }
}
