package irvine.oeis.a050;

import irvine.oeis.DifferenceSequence;

/**
 * A050117 a(n)=b(n)-b(n-1), where b=A050116 (ordered products of Lucas numbers).
 * @author Sean A. Irvine
 */
public class A050117 extends DifferenceSequence {

  /** Construct the sequence. */
  public A050117() {
    super(new A050116());
  }
}
