package irvine.oeis.a070;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A070808 Sum(((-1)^k*binomial(4*n,k)),k=n..2*n).
 * @author Georg Fischer
 */
public class A070808 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A070808() {
    super(0, "[[0],[-50400,588240,-2700016,6338144,-8266240,6026240,-2289664,352256],[-1296,16236,-80034,201214,-281454,221014,-90816,15136],[0,-576,5094,-17583,30375,-27759,12771,-2322]]", "1,2,42", 0);
  }
}
