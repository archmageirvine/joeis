package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A017170 a(n) = (9*n)^10.
 * @author Sean A. Irvine
 */
public class A017170 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017170() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {
        Z.ZERO,
        Z.valueOf(3486784401L),
        Z.valueOf(3570467226624L),
        Z.valueOf(205891132094649L),
        Z.valueOf(3656158440062976L),
        Z.valueOf(34050628916015625L),
        Z.valueOf(210832519264920576L),
        Z.valueOf(984930291881790849L),
        Z.valueOf(3743906242624487424L),
        new Z("12157665459056928801"),
        new Z("34867844010000000000")
    });
  }
}
