package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.oeis.PrependSequence;
import irvine.oeis.a091.A091440;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A073087 Least k such that sigma(k^k)&gt;=n*k^k.
 * @author Sean A. Irvine
 */
public class A073087 extends PrependSequence {

  // After David W. WILSON

  /** Construct the sequence. */
  public A073087() {
    super(1, new SimpleTransformSequence(new A091440().skip(3), Functions.PRIMORIAL::z), 1, 6, 30);
  }
}
