package irvine.oeis.a050;

import irvine.oeis.DifferenceSequence;

/**
 * A050119 a(n)=b(n)-b(n-1), where b=A050118 (ordered products of Lucas numbers).
 * @author Sean A. Irvine
 */
public class A050119 extends DifferenceSequence {

  /** Construct the sequence. */
  public A050119() {
    super(new A050118());
  }
}
