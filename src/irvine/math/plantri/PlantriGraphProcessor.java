package irvine.math.plantri;

/**
 * Gets given information from Plantri.
 * @author Sean A. Irvine
 */
public interface PlantriGraphProcessor {

  /**
   * Process the given graph, returning true if the graph
   * should be retained and counted in the output.
   *
   * @param plantri the plantri engine
   * @param state graph state
   * @return true if this graph should be counted
   */
  boolean accept(final Plantri plantri, final PlantriGraphState state);
}
