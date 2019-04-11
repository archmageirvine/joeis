package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017542 <code>(12n+1)^10</code>.
 * @author Sean A. Irvine
 */
public class A017542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017542() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {
        Z.ONE,
        Z.valueOf(137858491849L),
        Z.valueOf(95367431640625L),
        Z.valueOf(4808584372417849L),
        Z.valueOf(79792266297612001L),
        Z.valueOf(713342911662882601L),
        Z.valueOf(4297625829703557649L),
        new Z("19687440434072265625"),
        new Z("73742412689492826049"),
        new Z("236736367459211723401"),
        new Z("672749994932560009201")
      });
  }
}
