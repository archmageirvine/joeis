package irvine.oeis.a070;
// Generated by gen_seq4.pl 2024-04-05/parmof3 at 2024-04-05 23:22

/**
 * A070088 Number of integer-sided triangles with perimeter n and prime sides.
 * @author Georg Fischer
 */
public class A070088 extends A070080 {

  /** Construct the sequence. */
  public A070088() {
    super(1, COUNT, s -> hasPrimeSides(s));
  }
}
