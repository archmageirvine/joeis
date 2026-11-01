package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A087195 Numbers of the form 1+(1+p)*p^e, p prime and e&gt;0.
 * @author Sean A. Irvine
 */
public class A087195 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A087195() {
    super(1, 1, 1, (k, e) -> {
      final Z p = Functions.PRIME.z(k);
      return p.pow(e).multiply(p.add(1)).add(1);
    });
  }
}
