package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A017110 a(n) = (8*n+3)^10.
 * @author Sean A. Irvine
 */
public class A017110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017110() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.valueOf(59049), Z.valueOf(25937424601L), Z.valueOf(6131066257801L), Z.valueOf(205891132094649L), Z.valueOf(2758547353515625L), Z.valueOf(21611482313284249L), Z.valueOf(119042423827613001L), Z.valueOf(511116753300641401L), Z.valueOf(1822837804551761449L), Z.valueOf(5631351470947265625L), new Z("15516041187205853449")});
  }
}
