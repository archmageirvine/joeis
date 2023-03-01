package irvine.oeis.a061;
// manually A061810/parmof3 at 2023-02-28 11:58

/**
 * A061826 Multiples of 7 containing only even digits.
 * @author Georg Fischer
 */
public class A061826 extends A061810 {

  /** Construct the sequence. */
  public A061826() {
    super(1, 7, "[02468]+");
    super.next();
  }
}
