package irvine.oeis.a179;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A179582 Number of permutations of 1..n+7 with deficiencies #{i: p(i) &lt; i} exceeding the exceedances #{i: p(i) &gt; i} by n or more.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A179582 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A179582() {
    super(0, "[3216,-50489,356308,-1493643,4135184,-7940966,10793222,-10381228,6922880,-3047872,797280,-93888]", "[1,-20,180,-964,3422,-8484,15068,-19324,17769,-11432,4888,-1248,144]");
  }
}
