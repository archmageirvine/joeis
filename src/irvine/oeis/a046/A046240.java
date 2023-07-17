package irvine.oeis.a046;

/**
 * A046240 Cubes which are palindromes in base 8.
 * @author Sean A. Irvine
 */
public class A046240 extends A046232 {

  /** Construct the sequence. */
  public A046240() {
    super(0);
  }

  @Override
  protected int base() {
    return 8;
  }
}
