package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167827.
 * @author Sean A. Irvine
 */
public class A167827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167827() {
    super(new long[] {-666, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36},
      new Z[] {Z.ONE, Z.valueOf(38), Z.valueOf(1406), Z.valueOf(52022), Z.valueOf(1924814), Z.valueOf(71218118), Z.valueOf(2635070366L), Z.valueOf(97497603542L), Z.valueOf(3607411331054L), Z.valueOf(133474219248998L), Z.valueOf(4938546112212926L), Z.valueOf(182726206151878262L), Z.valueOf(6760869627619495694L), new Z("250152176221921340678"), new Z("9255630520211089605086")});
  }
}
