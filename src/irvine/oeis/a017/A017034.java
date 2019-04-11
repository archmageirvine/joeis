package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017034 <code>a(n) = (7*n + 4)^6</code>.
 * @author Sean A. Irvine
 */
public class A017034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017034() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {4096, 1771561, 34012224, 244140625, 1073741824, 3518743761L, 9474296896L});
  }
}
