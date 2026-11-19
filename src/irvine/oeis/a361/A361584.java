package irvine.oeis.a361;

import java.util.function.Function;
import irvine.math.api.Field;
import irvine.math.function.Functions;
import irvine.math.graph.Edges;
import irvine.math.z.Z;

/**
 * A361584 Number of digraphs on n unlabeled nodes whose strongly connected components are directed cycles or single vertices.
 * @author Gregory Morse
 */
public class A361584 extends A361583 {
  private static final Edges CYCLES = new Edges() {
    @Override
    public <E> E edges(final int[] partition, final Field<E> fld, final Function<Integer, E> yf) {
      if (partition.length == 0 || partition[0] != partition[partition.length - 1]) {
        return fld.zero();
      }
      // An automorphism of a directed cycle is a rotation.
      final int k = partition[0];
      return fld.coerce(Functions.FACTORIAL.z(partition.length - 1).multiply(Functions.PHI.i(k)).multiply(Z.valueOf(k).pow(partition.length - 1)));
    }
  };

  /**
   * Construct with an optional singleton component.
   * @param singletons whether singleton components are allowed
   */
  protected A361584(final boolean singletons) {
    super(CYCLES, singletons);
  }

  /** Construct the sequence. */
  public A361584() {
    this(true);
  }
}
