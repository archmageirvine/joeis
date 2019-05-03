package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175322 <code>a(n) = A053141(n)*A001109(n+1) = Sum_{k=A053141(n)+1..A001109(n+1)-1}</code> k.
 * @author Sean A. Irvine
 */
public class A175322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175322() {
    super(new long[] {1, -41, 246, -246, 41}, new long[] {12, 490, 17136, 584988, 19889100});
  }
}
