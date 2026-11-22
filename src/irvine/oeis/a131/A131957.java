package irvine.oeis.a131;

/**
 * A131957 Busy Beaver sigma variation: maximum number of 1's on the final tape, for a 2-state, 2-symbol Turing machine running on a tape which is initialized with the number n in binary and 0's everywhere else. The machine is started at the rightmost bit in the number n.
 * @author Gregory Morse
 */
public class A131957 extends A131956 {
  /** Construct the sequence. */
  public A131957() {
    super(true);
  }
}
