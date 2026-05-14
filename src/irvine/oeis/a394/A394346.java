package irvine.oeis.a394;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000005;
import irvine.oeis.a007.A007955;

/**
 * A394346 allocated for Jaroslav Krizek.
 * @author Sean A. Irvine
 */
public class A394346 extends Combiner {

  /** Construct the sequence. */
  public A394346() {
    super(1, new A000005(), new A007955(), MULTIPLY);
  }
}

