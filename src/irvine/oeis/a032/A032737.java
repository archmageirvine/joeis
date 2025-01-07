package irvine.oeis.a032;

/**
 * A032737 Composite numbers k such that all the decimal concatenations ik and ikj (i, j = 1...9) are also composite.
 * @author Sean A. Irvine
 */
public class A032737 extends A032734 {

  /** Construct the sequence. */
  public A032737() {
    super(1);
  }

  private static final String[] SUFFIXES = {"", "1", "3", "7", "9"};

  @Override
  protected String[] suffixes() {
    return SUFFIXES;
  }
}
