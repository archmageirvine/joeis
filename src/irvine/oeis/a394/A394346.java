package irvine.oeis.a394;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000005;
import irvine.oeis.a007.A007955;

/**
 * A394346 a(n) = tau(n) * pod(n) where tau(k) = the number of the divisors of k (A000005) and pod(k) = the product of the divisors of k (A007955).
 * @author Sean A. Irvine
 */
public class A394346 extends Combiner {

  /** Construct the sequence. */
  public A394346() {
    super(1, new A000005(), new A007955(), MULTIPLY);
  }
}

