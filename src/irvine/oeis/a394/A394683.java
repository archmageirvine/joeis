package irvine.oeis.a394;

import irvine.oeis.a002.A002496;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A394683 a(n) = (m*p)^2 + 1 where p = A002496(n) is the n-th prime of the form m^2 + 1.
 * @author Sean A. Irvine
 */
public class A394683 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A394683() {
    super(1, new A002496(), k -> k.pow(3).subtract(k.square()).add(1));
  }
}
