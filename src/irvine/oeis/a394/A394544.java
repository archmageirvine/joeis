package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.oeis.a002.A002113;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A394544 Largest prime factor of the n-th base 10 palindrome with a(1)=a(2)=1.
 * @author Sean A. Irvine
 */
public class A394544 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A394544() {
    super(1, new A002113(), Functions.GPF::z);
  }
}
