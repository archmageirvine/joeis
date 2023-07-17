package irvine.oeis.a046;

/**
 * A046248 Cubes which are palindromes in base 13.
 * @author Sean A. Irvine
 */
public class A046248 extends A046232 {

  /** Construct the sequence. */
  public A046248() {
    super(0);
  }

  @Override
  protected int base() {
    return 13;
  }
}
