package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A003780.
 * @author Sean A. Irvine
 */
public class A003780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003780() {
    super(new long[]{0, 0, 64, 0, 0, 0, -2876, 0, 0, 0, 23336, 0, 0, 0, -6116529, 0, 0, 0, 7628882, 0, 0, 0,
      39514076, 0, 0, 0, -43146455, 0, 0, 0, 16969316, 0, 0, 0, -5215246, 0, 0, 0,
      2138065, 0, 0, 0, -581608, 0, 0, 0, 78668, 0, 0, 0, -7125, 0, 0, 0, 262, 0, 0, 0},
      new Z[] {
        Z.ZERO,
        Z.ZERO,
        Z.ZERO,
        Z.ZERO,
        Z.ZERO,
        Z.valueOf(296),
        Z.ZERO,
        Z.ZERO,
        Z.ZERO,
        Z.valueOf(70420),
        Z.ZERO,
        Z.ZERO,
        Z.ZERO,
        Z.valueOf(16391166),
        Z.ZERO,
        Z.ZERO,
        Z.ZERO,
        Z.valueOf(3816021084L),
        Z.ZERO,
        Z.ZERO,
        Z.ZERO,
        Z.valueOf(888375830566L),
        Z.ZERO,
        Z.ZERO,
        Z.ZERO,
        Z.valueOf(206814474641944L),
        Z.ZERO,
        Z.ZERO,
        Z.ZERO,
        new Z("48146529005876746"),
        Z.ZERO,
        Z.ZERO,
        Z.ZERO,
        new Z("11208539472498838244"),
        Z.ZERO,
        Z.ZERO,
        Z.ZERO,
        new Z("2609354391828066201746"),
        Z.ZERO,
        Z.ZERO,
        Z.ZERO,
        new Z("607459192887167645884388"),
        Z.ZERO,
        Z.ZERO,
        Z.ZERO,
        new Z("141416847085185500394182672"),
        Z.ZERO,
        Z.ZERO,
        Z.ZERO,
        new Z("32921922778799648796216249818"),
        Z.ZERO,
        Z.ZERO,
        Z.ZERO,
        new Z("7664242427921761934124201980862"),
        Z.ZERO,
        Z.ZERO,
        Z.ZERO,
        new Z("1784240015038927382237215443432910")
      }
    );
  }
}
