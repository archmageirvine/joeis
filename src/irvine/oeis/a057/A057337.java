package irvine.oeis.a057;

import irvine.oeis.InverseSequence;

/**
 * A057337 1) Write the Zeckendorf expression of n; 2) Remove initial 1 and append a final 0; 3) Replace numbers in this as follows: 0 -&gt; 1, 010 -&gt; 2, 01010 -&gt; 3, 0101010 -&gt; 4...; 4) Find a binary number with run lengths from step 3 (starting with 1); 5) The term a(n) is the decimal equivalent of this binary number.
 * @author Sean A. Irvine
 */
public class A057337 extends InverseSequence {
  /** Construct the sequence. */
  public A057337() {
    super(new A057336());
  }
}
