package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A007787 Number of nonintersecting rook paths joining opposite corners of 5 X n board.
 * @author Sean A. Irvine
 */
public class A007787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007787() {
    super(1, new long[] {24, 319, 1822, 5376, 5328, -13218, -40292, 10392, 97396, 25534, -102314, -225284, 184306,
        492472, -542266, -301650, 678758, -180404, -274256, 239776, -44448, -40395, 33254, -12378, 2772, -383, 30},
      new Z[] {
        Z.ONE,
        new Z("16"),
        new Z("125"),
        new Z("976"),
        new Z("8512"),
        new Z("79384"),
        new Z("752061"),
        new Z("7110272"),
        new Z("67005561"),
        new Z("630588698"),
        new Z("5933085772"),
        new Z("55827318685"),
        new Z("525343024814"),
        new Z("4943673540576"),
        new Z("46521924780255"),
        new Z("437788749723725"),
        new Z("4119750109152730"),
        new Z("38768318191017931"),
        new Z("364823700357765771"),
        new Z("3433121323699285343"),
        new Z("32306898830469680384"),
        new Z("304019468350280601960"),
        new Z("2860931888452842047170"),
        new Z("26922391858409506569346"),
        new Z("253349332040459400463497"),
        new Z("2384107785665647075602841"),
        new Z("22435306570786253414376286")
      });
  }
}
