package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003766 Number of Hamiltonian paths in W_4 X P_n.
 * @author Sean A. Irvine
 */
public class A003766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003766() {
    super(new long[]{0, 64, -608, 1568, 832, -7196, 2530, 16228, -23055, 6908, 7519, -5867, 49, 1025, -193, -41, 14},
      new long[]{6, 152, 1608, 15420, 127980, 1003360, 7432708, 53294540, 371397240, 2537155684L, 17047659916L,
        113102692016L, 742597784164L, 4835184613212L, 31267479066856L, 201066698078244L, 1286998671857356L}
    );
  }
}
