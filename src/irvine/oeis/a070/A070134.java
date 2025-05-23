package irvine.oeis.a070;
// Generated by gen_seq4.pl 2024-04-05/parmof3 at 2024-04-05 23:22

/**
 * A070134 Numbers n such that [A070080(n), A070081(n), A070082(n)] is an obtuse isosceles integer triangle with relatively prime side lengths.
 * @author Georg Fischer
 */
public class A070134 extends A070080 {

  /** Construct the sequence. */
  public A070134() {
    super(1, INDEX, s -> isObtuse(s) && isIsosceles(s) && hasCoprimeSides(s));
  }
}
