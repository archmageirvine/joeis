package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075116 Binomial transform of <code>A073817: a(n)=Sum(Binomial(n,k)*A073817(k),(k=0,..,n))</code>.
 * @author Sean A. Irvine
 */
public class A075116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075116() {
    super(new long[] {-1, 6, -8, 5}, new long[] {4, 5, 9, 23});
  }
}
