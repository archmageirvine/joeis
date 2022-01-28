package irvine.oeis.a054;

/**
 * A054085 a(n) = order of in the permutation A054084 of the natural numbers if this order exists; a(n) = -1 otherwise.
 * @author Sean A. Irvine
 */
public class A054085 extends A054083 {

  /** Construct the sequence. */
  public A054085() {
    super(new A054084());
  }
}
