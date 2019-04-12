package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167827 Number of reduced words of length n in Coxeter group on 38 generators S_i with relations (S_i)^2 = (S_i S_j)^15 = I.
 * @author Sean A. Irvine
 */
public class A167827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167827() {
    super(new long[] {-666, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36},
      new Z[] {Z.valueOf(38), Z.valueOf(1406), Z.valueOf(52022), Z.valueOf(1924814), Z.valueOf(71218118), Z.valueOf(2635070366L), Z.valueOf(97497603542L), Z.valueOf(3607411331054L), Z.valueOf(133474219248998L), Z.valueOf(4938546112212926L), Z.valueOf(182726206151878262L), Z.valueOf(6760869627619495694L), new Z("250152176221921340678"), new Z("9255630520211089605086"), new Z("342458329247810315387479")}, Z.ONE);
  }
}
