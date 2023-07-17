package irvine.oeis.a046;

/**
 * A046242 Cubes which are palindromes in base 9.
 * @author Sean A. Irvine
 */
public class A046242 extends A046232 {

  /** Construct the sequence. */
  public A046242() {
    super(0);
  }

  @Override
  protected int base() {
    return 9;
  }
}
