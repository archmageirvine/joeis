package irvine.oeis.a046;

/**
 * A046238 Cubes which are palindromes in base 7.
 * @author Sean A. Irvine
 */
public class A046238 extends A046232 {

  /** Construct the sequence. */
  public A046238() {
    super(0);
  }

  @Override
  protected int base() {
    return 7;
  }
}
