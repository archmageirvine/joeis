package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017098 a(n) = (8*n + 2)^10.
 * @author Sean A. Irvine
 */
public class A017098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017098() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.valueOf(1024), Z.valueOf(10000000000L), Z.valueOf(3570467226624L), Z.valueOf(141167095653376L), Z.valueOf(2064377754059776L), Z.valueOf(17080198121677824L), Z.valueOf(97656250000000000L), Z.valueOf(430804206899405824L), Z.valueOf(1568336880910795776L), Z.valueOf(4923990397355877376L), new Z("13744803133596058624")});
  }
}
