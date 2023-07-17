package irvine.oeis.a046;

/**
 * A046244 Cubes which are palindromes in base 11.
 * @author Sean A. Irvine
 */
public class A046244 extends A046232 {

  /** Construct the sequence. */
  public A046244() {
    super(0);
  }

  @Override
  protected int base() {
    return 11;
  }
}
