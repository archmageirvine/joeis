package irvine.math.group;

import java.util.Arrays;

import irvine.math.api.Matrix;
import irvine.math.api.Set;
import irvine.math.matrix.SmallDenseMatrix;
import irvine.math.set.FiniteSet;
import irvine.math.z.Z;

/**
 * The simple exceptional group <code>G_2(3)</code>.
 * @author Sean A. Irvine
 */
public class ExceptionalG23 extends Generator<Matrix<Z>> {

  private static final GeneralLinearGroup<Z> PARENT = new GeneralLinearGroup<>(7, new GaloisField(3));
  private static final Z[][] A = {
    {Z.ZERO, Z.ONE, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO},
    {Z.ONE, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ZERO, Z.ONE, Z.ZERO, Z.ZERO, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ONE, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ONE, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ONE, Z.ZERO, Z.ZERO},
    {Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.TWO, Z.TWO, Z.TWO}
  };
  private static final Z[][] B = {
    {Z.ONE, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ONE, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO},
    {Z.TWO, Z.TWO, Z.TWO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ONE, Z.ZERO, Z.ZERO},
    {Z.TWO, Z.ZERO, Z.ZERO, Z.TWO, Z.TWO, Z.ZERO, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ONE},
    {Z.TWO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.TWO, Z.TWO}
  };
  private static final Matrix<Z> GEN_A = new SmallDenseMatrix<>(A, Z.ZERO);
  private static final Matrix<Z> GEN_B = new SmallDenseMatrix<>(B, Z.ZERO);
  private static final FiniteSet<Matrix<Z>> GENERATORS = new FiniteSet<>(Arrays.asList(GEN_A, GEN_B));

  /**
   * Create the group <code>G_2(3)</code>.
   * Note very slow and uses a lot of memory.
   */
  public ExceptionalG23() {
    // Use a special zero below, so that it is the same matrix type as the elements
    super(PARENT, GENERATORS, new SmallDenseMatrix<>(PARENT.zero(), Z.ZERO), true);
  }

  @Override
  public boolean isSimple() {
    return true;
  }

  /**
   * The permutations generating the group.
   * @return generators
   */
  public Set<Matrix<Z>> getGenerators() {
    return GENERATORS;
  }

  @Override
  public String toString() {
    return "G_2(3)";
  }
}
