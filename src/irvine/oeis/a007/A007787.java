package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A007787.
 * @author Sean A. Irvine
 */
public class A007787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007787() {
    super(new long[] {24, 319, 1822, 5376, 5328, -13218, -40292, 10392, 97396, 25534, -102314, -225284, 184306,
        492472, -542266, -301650, 678758, -180404, -27456, 239776, -44448, -40395, 33254, -12378, 2772, -383, 30},
      new Z[] {Z.ONE, Z.valueOf(16), Z.valueOf(125), Z.valueOf(976), Z.valueOf(8512), Z.valueOf(79384),
        Z.valueOf(752061), Z.valueOf(7110272), Z.valueOf(67005561), Z.valueOf(630588698), Z.valueOf(5933085772L),
        Z.valueOf(55827318685L), Z.valueOf(525343024814L), Z.valueOf(4943673540576L), Z.valueOf(46521924780255L),
        Z.valueOf(437788749723725L), Z.valueOf(4119750109152730L), Z.valueOf(38768318191017931L),
        Z.valueOf(364823700357765771L), Z.valueOf(3433121323699285343L), new Z("32306898830469680384"),
        new Z("304019468350280601960"), new Z("2860931888452842047170"), new Z("26922391858409506569346"),
        new Z("253349332040459400463497"), new Z("2384107785665647075602841"), new Z("22435306570786253414376286")});
  }
}
