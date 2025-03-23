package irvine.math.nauty;

/**
 * The maximum number of edges for a certain type of graph of given number of nodes.
 * @author Sean A. Irvine
 */
interface MaxEdges {

  /**
   * Return the maximum number of edges in a graph
   * @param vertices number of vertices
   * @return number of edges
   */
  int getMaxEdges(final int vertices);

  MaxEdges MAX_EDGES_SQUARE_FREE = new MaxExtensible(0, 0, 1, 3, 4, 6, 7, 9, 11, 13, 16, 18, 21, 24, 27, 30, 33, 36, 39, 42,
    46, 50, 52, 56, 59, 63, 67, 71, 76, 80, 85, 90, 92, 96, 102, 106, 110, 113, 117, 122, 127);
  MaxEdges MAX_EDGES_PENTAGON_FREE = new MaxExtensible(0, 0, 1, 3, 6, 7, 9, 12, 16, 20, 25, 30, 36, 42, 49, 56, 64, 72, 81, 90, 100, 110, 121, 132, 144, 156, 169, 182, 196, 210, 225, 240, 256);
  MaxEdges MAX_EDGES_BIPARTITE_SQUARE_FREE = new MaxExtensible(0, 0, 1, 2, 3, 4, 6, 7, 9, 10, 12, 14, 16, 18, 21, 22, 24, 26, 29, 31, 34, 36, 39, 42, 45, 48, 52, 53, 56, 58, 61, 64, 67, 70, 74, 77, 81, 84, 88, 92, 96, 100, 105, 106, 108, 110, 115, 118, 122, 126, 130, 134, 138, 142, 147, 151, 156, 160, 165, 170, 175, 180, 186, 187);
  MaxEdges MAX_EDGES_TRIANGLE_AND_SQUARE_FREE = new MaxExtensible(0, 0, 1, 2, 3, 5, 6, 8, 10, 12, 15, 16, 18, 21, 23, 26, 28, 31, 34, 38, 41, 44, 47, 50, 54, 57, 61, 65, 68, 72, 76, 80, 85, 87, 90, 95, 99, 104, 109, 114, 120, 124, 129, 134, 139, 145, 150, 156, 162, 168, 175, 176, 178);
  MaxEdges MAX_EDGES_TRIANGLE_AND_PENTAGON_FREE = new MaxExtensible(0, 0, 1, 2, 4, 6, 9, 12, 16, 20, 25, 30, 36, 42, 49, 56, 64, 72, 81, 90, 100, 110, 121, 132, 144, 156, 169, 182, 196, 210, 225, 240, 256);
  MaxEdges MAX_EDGES_SQUARE_AND_PENTAGON_FREE = new MaxExtensible(0, 0, 1, 3, 4, 6, 7, 9, 10, 12, 14, 16, 18, 20, 23, 25, 28, 30, 33, 35, 38, 42, 43, 45, 48, 50, 53, 55, 58, 62, 65, 67, 70, 73, 77, 79, 82, 86, 89, 93, 96, 100, 105, 107);
  MaxEdges MAX_EDGES_TRI_SQ_PENTAGON_FREE = new MaxExtensible(0, 0, 1, 2, 3, 4, 6, 7, 9, 10, 12, 14, 16, 18, 21, 22, 24, 26, 29, 31, 34, 36, 39, 42, 45, 48, 52, 53, 56, 58, 61, 64, 67, 70, 74, 77, 81, 84, 88, 92, 96, 100, 105, 106, 108, 110, 115, 118, 122, 126, 130, 134, 138, 142, 147, 151, 156, 160, 165, 170, 175, 180, 186, 187, 189);

  static int getMaxEdges(final int generationFlags, final int vertices) {
    switch (generationFlags) {
      case 0:
        return (vertices * vertices - vertices) / 2;
      case GenerateGraphs.TRIANGLE_FREE:
      case GenerateGraphs.BIPARTITE:
      case GenerateGraphs.BIPARTITE | GenerateGraphs.TRIANGLE_FREE:
      case GenerateGraphs.BIPARTITE | GenerateGraphs.PENTAGON_FREE:
      case GenerateGraphs.BIPARTITE | GenerateGraphs.TRIANGLE_FREE | GenerateGraphs.PENTAGON_FREE:
        return new MaxEdgesTriangleFree().getMaxEdges(vertices); // bipartite maximum is the same as triangle free
      case GenerateGraphs.BIPARTITE | GenerateGraphs.SQUARE_FREE:
      case GenerateGraphs.BIPARTITE | GenerateGraphs.SQUARE_FREE | GenerateGraphs.TRIANGLE_FREE:
      case GenerateGraphs.BIPARTITE | GenerateGraphs.SQUARE_FREE | GenerateGraphs.PENTAGON_FREE:
      case GenerateGraphs.BIPARTITE | GenerateGraphs.SQUARE_FREE | GenerateGraphs.TRIANGLE_FREE | GenerateGraphs.PENTAGON_FREE:
        return MAX_EDGES_BIPARTITE_SQUARE_FREE.getMaxEdges(vertices);
      case GenerateGraphs.TRIANGLE_FREE | GenerateGraphs.SQUARE_FREE:
        return MAX_EDGES_TRIANGLE_AND_SQUARE_FREE.getMaxEdges(vertices);
      case GenerateGraphs.TRIANGLE_FREE | GenerateGraphs.SQUARE_FREE | GenerateGraphs.PENTAGON_FREE:
        return MAX_EDGES_TRI_SQ_PENTAGON_FREE.getMaxEdges(vertices);
      case GenerateGraphs.TRIANGLE_FREE | GenerateGraphs.PENTAGON_FREE:
        return MAX_EDGES_TRIANGLE_AND_PENTAGON_FREE.getMaxEdges(vertices);
      case GenerateGraphs.SQUARE_FREE:
        return MAX_EDGES_SQUARE_FREE.getMaxEdges(vertices);
      case GenerateGraphs.SQUARE_FREE | GenerateGraphs.PENTAGON_FREE:
        return MAX_EDGES_SQUARE_AND_PENTAGON_FREE.getMaxEdges(vertices);
      case GenerateGraphs.PENTAGON_FREE:
        return MAX_EDGES_PENTAGON_FREE.getMaxEdges(vertices);
      default:
        throw new UnsupportedOperationException("Cannot generate edge set for flags " + Integer.toBinaryString(generationFlags));
    }
  }
}
