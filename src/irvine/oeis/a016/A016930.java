package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016930 a(n) = (6*n + 1)^10.
 * @author Sean A. Irvine
 */
public class A016930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016930() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 282475249, 137858491849L, 6131066257801L, 95367431640625L, 819628286980801L, 4808584372417849L, 21611482313284249L, 79792266297612001L, 253295162119140625L, 713342911662882601L});
  }
}
