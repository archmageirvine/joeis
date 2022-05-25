package irvine.oeis.a139;
// manually A139056/parmof2 at 2022-05-24 11:23

/**
 * A139197 Natural numbers of the form (prime(n)!-9)/9.
 * @author Georg Fischer
 */
public class A139197 extends A139160 {

  /** Construct the sequence. */
  public A139197() {
    super(1, -9);
    super.next();
    super.next();
    super.next();
  }
}
