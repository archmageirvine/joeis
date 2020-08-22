package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017194 a(n) = (9*n + 2)^10.
 * @author Sean A. Irvine
 */
public class A017194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017194() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.valueOf(1024), Z.valueOf(25937424601L), Z.valueOf(10240000000000L), Z.valueOf(420707233300201L), Z.valueOf(6278211847988224L), Z.valueOf(52599132235830049L), Z.valueOf(303305489096114176L), Z.valueOf(1346274334462890625L), Z.valueOf(4923990397355877376L), new Z("15516041187205853449"), new Z("43438845422363213824")});
  }
}
