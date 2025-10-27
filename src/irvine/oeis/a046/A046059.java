package irvine.oeis.a046;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a000.A000001;

/**
 * A046059 Orders of finite groups having the incrementally largest numbers of nonisomorphic forms A046058.
 * @author Sean A. Irvine
 */
public class A046059 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A046059() {
    super(1, new A000001().skip(), 1);
  }
}

