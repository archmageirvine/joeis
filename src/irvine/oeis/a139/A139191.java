package irvine.oeis.a139;
// manually A139056/parmof2 at 2022-05-24 23:14

/**
 * A139191 Natural numbers of the form (prime(n)!-3)/3.
 * @author Georg Fischer
 */
public class A139191 extends A139160 {

  /** Construct the sequence. */
  public A139191() {
    super(1, -3);
    super.next();
  }
}
