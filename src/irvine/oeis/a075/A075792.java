package irvine.oeis.a075;
// manually deris/stirling2 at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.transform.Stirling2TransformSequence;
import irvine.oeis.a089.A089064;

/**
 * A075792 E.g.f.: 1 + log(1+f(x)) where f(x) = log(1/(2-exp(x))) = e.g.f. for A000629.
 * @author Georg Fischer
 */
public class A075792 extends PrependSequence {

  /** Construct the sequence. */
  public A075792() {
    super(new Stirling2TransformSequence(new A089064(),  0).skip(1), 1);
  }
}
