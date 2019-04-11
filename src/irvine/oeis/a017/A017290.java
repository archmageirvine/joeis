package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017290 <code>a(n) = (10*n + 1)^10</code>.
 * @author Sean A. Irvine
 */
public class A017290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017290() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.ONE, Z.valueOf(25937424601L), Z.valueOf(16679880978201L), Z.valueOf(819628286980801L), Z.valueOf(13422659310152401L), Z.valueOf(119042423827613001L), Z.valueOf(713342911662882601L), Z.valueOf(3255243551009881201L), new Z("12157665459056928801"), new Z("38941611811810745401"), new Z("110462212541120451001")});
  }
}
