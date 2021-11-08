package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A028471 Number of perfect matchings (or domino tilings) in the graph P_9 X P_2n.
 * @author Sean A. Irvine
 */
public class A028471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028471() {
    super(new long[]{-1, 209, -11936, 274208, -3112032, 19456019, -70651107, 152325888, -196664896, 152325888, -70651107, 19456019, -3112032, 274208, -11936, 209},
      new Z[]{
        Z.ONE, new Z("55"), new Z("6336"), new Z("817991"), new Z("108435745"), new Z("14479521761"), new Z("1937528668711"), new Z("259423766712000"), new Z("34741645659770711"), new Z("4652799879944138561"), new Z("623139489426439754945"), new Z("83456125990631342400791"), new Z("11177167872295392172767936"), new Z("1496943834332592837945956455"), new Z("200483802581126644843760725601"), new Z("26850544175719495201771597130401")
      }
    );
  }
}
