package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001097;

/**
 * A399911.
 * @author Sean A. Irvine
 */
public class A087383 extends FilterSequence {

  /** Construct the sequence. */
  public A087383() {
    super(1, new A001097(), p -> {
      final Z q = Functions.PRIME.z(Functions.PRIME.z(p));
      return q.subtract(2).isProbablePrime() || q.add(2).isProbablePrime();
    });
  }
}

