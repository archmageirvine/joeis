package irvine.oeis.a139;
// manually A139056/parmof2 at 2022-05-24 11:23

/**
 * A139193 Natural numbers of the form (prime(n)! - 5)/5.
 * @author Georg Fischer
 */
public class A139193 extends A139160 {

  /** Construct the sequence. */
  public A139193() {
    super(1, -5);
    super.next();
    super.next();
  }
}
